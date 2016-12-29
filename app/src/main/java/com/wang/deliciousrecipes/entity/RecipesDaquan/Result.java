/**
  * Copyright 2016 bejson.com
  */
package com.wang.deliciousrecipes.entity.RecipesDaquan;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2016-12-26 22:4:5
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Result {

    private List<Data> data;
    @JsonProperty("totalNum")
    private String totalnum;
    private String pn;
    private String rn;
    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }

    public void setTotalnum(String totalnum) {
         this.totalnum = totalnum;
     }
     public String getTotalnum() {
         return totalnum;
     }

    public void setPn(String pn) {
         this.pn = pn;
     }
     public String getPn() {
         return pn;
     }

    public void setRn(String rn) {
         this.rn = rn;
     }
     public String getRn() {
         return rn;
     }

}