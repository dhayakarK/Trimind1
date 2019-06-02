package day06;

import java.util.Objects;

public class HashCode {
    public String country;
    public String location;
    HashCode(String country1,String location1)
    {
        this.country=country1;
        this.location=location1;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "HashCode{" +
                "country='" + country + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
   @Override
    public  boolean equals(Object o)
    {
      HashCode hashCode=(HashCode)o;
      boolean countrymatch=this.getCountry().equals(hashCode.getCountry());
      boolean namematch=this.getLocation().equals(hashCode.getLocation());
      return countrymatch&&namematch;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(this.country,this.location);
    }

}
