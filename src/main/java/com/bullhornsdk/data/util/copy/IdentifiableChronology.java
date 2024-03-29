package com.bullhornsdk.data.util.copy;

import org.joda.time.Chronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;

import com.esotericsoftware.kryo.io.Input;

/**
 * Copied from https://github.com/magro/kryo-serializers under Apache-2.0 license
 *
 * An enumeration that provides a String id for subclasses of {@link Chronology}.
 * For {@link ISOChronology}, <code>null</code> is used as id, as {@link ISOChronology}
 * is used as default and the id does not have to be serialized.
 *
 * @author Martin Grotzke (martin.grotzke@freiheit.com) (initial creation)
 */
enum IdentifiableChronology {

    ISO( null, ISOChronology.getInstance() ),
    COPTIC( "COPTIC", CopticChronology.getInstance() ),
    ETHIOPIC( "ETHIOPIC", EthiopicChronology.getInstance()),
    GREGORIAN("GREGORIAN", GregorianChronology.getInstance()),
    JULIAN("JULIAN", JulianChronology.getInstance()),
    ISLAMIC("ISLAMIC",IslamicChronology.getInstance()),
    BUDDHIST( "BUDDHIST", BuddhistChronology.getInstance()),
    GJ( "GJ", GJChronology.getInstance());

    private final String _id;
    private final Chronology _chronology;

    private IdentifiableChronology( final String id, final Chronology chronology ) {
        _id = id;
        _chronology = chronology;
    }

    public String getId() {
        return _id;
    }

    /**
     * Determines the id for the given {@link Chronology} subclass that later
     * can be used to resolve the {@link Chronology} with {@link #valueOfId(String)}.
     * For {@link ISOChronology} class <code>null</code> is returned.
     *
     * @param clazz a subclass of {@link Chronology}.
     * @return an id, or <code>null</code> for {@link ISOChronology}.
     * @throws IllegalArgumentException if the {@link Chronology} is not supported.
     */
    public static String getIdByChronology( final Class<? extends Chronology> clazz ) throws IllegalArgumentException {
        for( final IdentifiableChronology item : values() ) {
            if ( clazz.equals( item._chronology.getClass() ) ) {
                return item._id;
            }
        }
        throw new IllegalArgumentException( "Chronology not supported: " + clazz.getSimpleName() );
    }

    /**
     * Returns the chronology of the {@link IdentifiableChronology} matching the
     * provided <code>id</code>. If the provided <code>id</code> is <code>null</code>,
     * {@link ISOChronology} is returned.
     * @param id the id from {@link #getIdByChronology(Class)}.
     * @return a matching {@link Chronology} if any was found.
     * @throws IllegalArgumentException if no match was found.
     */
    public static Chronology valueOfId(final String id) throws IllegalArgumentException {
        if ( id == null ) {
            return ISO._chronology;
        }
        for( final IdentifiableChronology item : values() ) {
            if ( id.equals( item._id ) ) {
                return item._chronology;
            }
        }
        throw new IllegalArgumentException( "No chronology found for id " + id );
    }

    static Chronology readChronology( final Input input ) {
        final String chronologyId = input.readString();
        return IdentifiableChronology.valueOfId( "".equals( chronologyId ) ? null : chronologyId );
    }

    static String getChronologyId( final Chronology chronology ) {
        return IdentifiableChronology.getIdByChronology( chronology.getClass() );
    }

}
