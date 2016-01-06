# bullhorn-data
A Java client library for working with the Bullhorn REST API service. Handles authentication as well as interaction with the API operations.

## Available as maven dependency

There is a private Maven repository on Artifactory.

### Add repository to your pom

```xml

	<repositories>
		<repository>
			<id>dev-fs</id>
			<name>dev-fs-releases</name>
			<url>http://dev-fs.bh-bos2.bullhorn.com:8081/artifactory/bh-platform-release</url>
		</repository>
	</repositories>
```
### Add dependency to your pom

```xml

	<dependency>
		<groupId>com.bullhornsdk.data</groupId>
		<artifactId>bullhorn-data</artifactId>
		<version>1.1.0-RELEASE</version>
	</dependency>
```


## Basic setup:

Provide your credentials and instantiate StandardBullhornApiRest:
```java
        RestApiSettings creds = new RestApiSettings();
		creds.setPassword("apipassword");
		creds.setRestAuthorizeUrl("rest.authorizeUrl");
		creds.setRestClientId("rest.clientId");
		creds.setRestClientSecret("rest.clientSecret"));
		creds.setRestLoginUrl(env.getProperty("rest.loginUrl");
		creds.setRestSessionMinutesToLive("rest.sessionMinutesToLive");
		creds.setRestTokenUrl("rest.tokenUrl");
		creds.setUsername("apiusername");
		BullhornData bullhornData = new StandardBullhornData(creds);
```




## Using with Spring Boot

Add a configuration class:
```java
@Configuration
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	/**
	 * Provide your credentials and instantiate {@link StandardBullhornData} with those.
	 * @return
	 */
	@Profile({ "staging", "production" })
	@Bean
	public BullhornData bullhornData() {

		RestApiSettings creds = new RestApiSettings();
		creds.setPassword(env.getProperty("apipassword"));
		creds.setRestAuthorizeUrl(env.getProperty("rest.authorizeUrl"));
		creds.setRestClientId(env.getProperty("rest.clientId"));
		creds.setRestClientSecret(env.getProperty("rest.clientSecret"));
		creds.setRestLoginUrl(env.getProperty("rest.loginUrl"));
		creds.setRestSessionMinutesToLive(env.getProperty("rest.sessionMinutesToLive"));
		creds.setRestTokenUrl(env.getProperty("rest.tokenUrl"));
		creds.setUsername(env.getProperty("apiusername"));
		return new StandardBullhornData(creds);

	}

	/**
	 * Using {@link MockBullhornData} for testing purposes. This implementation of {@link BullhornData} uses test data stored in local
	 * text files.
	 * 
	 * @return
	 */
	@Profile("testing")
	@Bean
	public BullhornData mockBullhornData() {

		return new MockBullhornData();

	}
}
```
