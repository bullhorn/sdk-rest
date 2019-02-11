# sdk-rest
A Java client library for working with the Bullhorn REST API. Handles authentication and objectifies API operations.

## Requirements
- Java 10
- Maven > 3.6.0

## Available as a Maven dependency

### Add dependency to your pom file

```xml

	<dependency>
		<groupId>com.bullhorn</groupId>
		<artifactId>sdk-rest</artifactId>
		<version>2.0.0</version>
	</dependency>
```


## Basic setup:

Provide your credentials and instantiate StandardBullhornApiRest:
```java
        BullhornRestCredentials creds = new BullhornRestCredentials();
		creds.setPassword("apipassword");
		creds.setRestAuthorizeUrl("rest.authorizeUrl");
		creds.setRestClientId("rest.clientId");
		creds.setRestClientSecret("rest.clientSecret");
		creds.setRestLoginUrl(env.getProperty("rest.loginUrl");
		creds.setRestSessionMinutesToLive("rest.sessionMinutesToLive");
		creds.setRestTokenUrl("rest.tokenUrl");
		creds.setUsername("apiusername");
		BullhornData bullhornData = new StandardBullhornData(creds);
```


## Usage

See the unit tests for sample usage.

## Use with Spring Boot

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

		RestCredentials creds = new BullhornRestCredentials();
        creds.setPassword("apipassword");
        creds.setRestAuthorizeUrl("rest.authorizeUrl");
        creds.setRestClientId("rest.clientId");
        creds.setRestClientSecret("rest.clientSecret");
        creds.setRestLoginUrl(env.getProperty("rest.loginUrl");
        creds.setRestSessionMinutesToLive("rest.sessionMinutesToLive");
        creds.setRestTokenUrl("rest.tokenUrl");
        creds.setUsername("apiusername");
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
