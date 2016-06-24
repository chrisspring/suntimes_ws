/**
 * suntimes_ws
 * SunTimesSEI 
 * Service Endpoint Interface for the sunrise/set Web Service 
 * See SunTimes.java for a description of the methods and their
 *  arguments.
 */
package net.kevinboone.apacheintegration.suntimes_ws;
import javax.jws.*;

@WebService(name="SunTimesWS") 
public interface SunTimesSEI 
  {
  /* Note that java2ws does not convert Java argument names to WSDL
     argument names; they just get named arg0... We must specify
     them explicitly. See
     https://cwiki.apache.org/confluence/display/CXF/FAQ */

  public String getSunsetTimeUTC (@WebParam(name="year") int year, 
      @WebParam(name="month") int month, 
      @WebParam(name="day") int day, 
      @WebParam(name="longitude") double longitude, 
      @WebParam(name="latitude") double latitude)
    throws SunTimesException;

  public String getSunriseTimeUTC (@WebParam(name="year") int year, 
      @WebParam(name="month") int month, 
      @WebParam(name="day") int day, 
      @WebParam(name="longitude") double longitude, 
      @WebParam(name="latitude") double latitude)
    throws SunTimesException;
  }


