/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.apache.commons.lang3.StringUtils;
/*

  Task: Implement bid request targetings as instructed. Find below a bid request in JSON format. 
  
  Bid Request:
  
 {
   "app":{
      "bundle":"1369521645",
      "name":"Words Of Wonders",
      "storeurl":"https://itunes.apple.com/us/app/words-of-wonders"
   },
   "device":{
      "geo":{
         "country":"FRA"
      },
      "ip":"213.41.142.0",
      "language":"it",
      "make":"Apple",
      "model":"iPhone",
      "os":"iOS",
      "osv":"12.1",
      "ua":"Mozilla/5.0 (CPU iPhone OS 12_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/16B92"
   },
   "imp":[
      {
         "banner":{
            "h":50,
            "w":320
         },
         "bidfloor":1.690
      }
   ]
}
 */

class Solution {
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    
    JSONObject request = parseRequest();
    List<Targeting> targetings = new ArrayList<>();
    targetings.add(Targeting.create(1L,"FRA"));
    targetings.add(Targeting.create(32L,"DEU"));
    targetings.add(Targeting.create(20L,"FRA"));

    Set<Long> matchingCampaigns = getMatchingCampaigns(request, targetings);
    
    System.out.println("Matching Campaign IDs: " + StringUtils.join(matchingCampaigns, ","));
    
  }
  
  
  
  
  private static Set<Long> getMatchingCampaigns(JSONObject request, List<Targeting> targetings){
    
    //TODO: implement proper matching
    //System.out.println(targetings.get(0).country);
    //System.out.println(targetings.get(1).country);
    //System.out.println(targetings.get(2).country);
    JSONObject device = (JSONObject) request.get("device");
    JSONObject geo = (JSONObject) device.get("geo");
    String country = (String) geo.get("country");


    Set<Long> a = new HashSet<Long>();
    for(int i=0; i<targetings.size(); i++){
      if(targetings.get(i).country.equals(country)){
        a.add(targetings.get(i).campaignId);
      }
    }

    System.out.println(device);
    System.out.println("\n"+geo);
    System.out.println("\n"+country);

    //System.out.println("country: " + ((String) ((JSONObject) request.get("device"));

    //).get("geo")).get("country")
    
    return a;
  }
  
  
  
  
  private static class Targeting {
    String country;
    Long campaignId;
    
    static Targeting create(Long campaignId,String country){
      Targeting t = new Targeting();
      t.campaignId = campaignId;
      t.country = country;
      return t;
    }
  }
  
  
  
  
  private static JSONObject parseRequest(){
    JSONParser parser = new JSONParser();
    try{
      JSONObject request = (JSONObject) parser.parse("{\"app\":{\"bundle\":\"1369521645\",\"name\":\"Words Of Wonders\","+
                                                     "\"storeurl\":\"https://itunes.apple.com/us/app/words-of-wonders\"},"+
                                                     "\"device\":{\"geo\":{\"country\":\"DEU\" },\"ip\":\"213.41.142.0\"," +
                                                     "\"language\":\"it\",\"make\":\"Apple\",\"model\":\"iPhone\",\"os\":" +
                                                     "\"iOS\",\"osv\":\"12.1\",\"ua\":\"Mozilla/5.0 (iPhone; CPU iPhone OS" +
                                                     "12_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/"+
                                                     "16B92\" },\"imp\":[ {\"banner\":{\"h\":50,\"w\":320 },\"bidfloor\":1.690 }]}");
      //System.out.println("request object: " + request + "\n");
      //System.out.println("app: " + request.get("app")+ "\n");
     System.out.println("storeurl: " + ((String) ((JSONObject) request.get("app")).get("storeurl"))+ "\n");
      // System.out.println("first imp: " + ((JSONArray) request.get("imp")).get(0)+ "\n");
      return request;
    }catch(ParseException e){
      e.printStackTrace();
    }
    return null;
  }
  

}