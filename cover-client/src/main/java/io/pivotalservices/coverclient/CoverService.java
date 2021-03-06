package io.pivotalservices.coverclient;

/**
 * Created by benwilcock on 29/11/2016.
 * An interface for the CoversService to allow easy mocking when testing.
 */
public interface CoverService {
    public String getCovers();
    public String getCoversFallbackMethod();
}
