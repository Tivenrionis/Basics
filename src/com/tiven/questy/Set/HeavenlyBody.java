package com.tiven.questy.Set;

import java.util.HashSet;
import java.util.Set;
// za kazdym razem kiedy chcesz uzyc swojego obiektu w mapie jako klucz lub w set'cie jako element...
// Trzeba nadpisac metody hashcode and equals

// I zasada : Jezeli oba obiekty sa equals() to musza miec te same hashcody

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);


    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }
}
