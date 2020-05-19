package com.tiven.questy.Set;

import java.util.HashSet;
import java.util.Set;
// za kazdym razem kiedy chcesz uzyc swojego obiektu w mapie jako klucz lub w set'cie jako element...
// Trzeba nadpisac metody hashcode and equals

// I zasada : Jezeli oba obiekty sa equals() to musza miec te same hashcody

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyType;


    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }
    //
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        HeavenlyBody body = (HeavenlyBody) o;
//        return Double.compare(body.orbitalPeriod, orbitalPeriod) == 0 &&
//                name.equals(body.name);
//    }
//


    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())) {
                return this.bodyType.equals(theObject.getBodyType());
            }
        }

        return false;

    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.getBodyType().hashCode();
    }
}
