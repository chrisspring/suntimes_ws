/**
 * suntimes_ws
 * Test 
 * Simple test code for the sunrise/set algorithm
 * Invokes the algorithm directly, then starts a JAXWS server endpoing
 * at http://localhost:9001/suntimes_ws
 */
package net.kevinboone.apacheintegration.suntimes_ws;
import javax.xml.ws.Endpoint;

class Test
  {
  public static void main (String[] args)
      throws SunTimesException
    {
    SunTimesSEI st = new SunTimes();
    String sr = st.getSunriseTimeUTC (2014, 8, 2, 
      0, 51);
    System.out.println ("Sunrise in London on Aug 8 2014 is " + sr + " UTC");
    String ss = st.getSunsetTimeUTC (2014, 8, 2, 
      0, 51);
    System.out.println ("Sunset in London on Aug 8 2014 is " + ss + " UTC");
 
    Object implementor = st;
    String address = "http://localhost:8181/suntimes_ws";
    Endpoint.publish (address, implementor);
    }
  }

