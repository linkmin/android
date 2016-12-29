/**
  * Copyright 2016 bejson.com
  */
package com.wang.deliciousrecipes.entity.PressRecipesIDSee;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2016-12-27 19:4:0
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Result {

    private List<Data> data;
    @JsonProperty("totalNum")
    private int totalnum;
    private int pn;
    private int rn;
    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }

    public void setTotalnum(int totalnum) {
         this.totalnum = totalnum;
     }
     public int getTotalnum() {
         return totalnum;
     }

    public void setPn(int pn) {
         this.pn = pn;
     }
     public int getPn() {
         return pn;
     }

    public void setRn(int rn) {
         this.rn = rn;
     }
     public int getRn() {
         return rn;
     }

}