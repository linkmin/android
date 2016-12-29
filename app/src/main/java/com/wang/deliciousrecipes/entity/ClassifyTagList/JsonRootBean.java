/**
  * Copyright 2016 bejson.com
  */
package com.wang.deliciousrecipes.entity.ClassifyTagList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2016-12-27 18:49:15
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private String resultcode;
    private String reason;
    private List<Result> result;
    @JsonProperty("error_code")
    private int errorCode;
    public void setResultcode(String resultcode) {
         this.resultcode = resultcode;
     }
     public String getResultcode() {
         return resultcode;
     }

    public void setReason(String reason) {
         this.reason = reason;
     }
     public String getReason() {
         return reason;
     }

    public void setResult(List<Result> result) {
         this.result = result;
     }
     public List<Result> getResult() {
         return result;
     }

    public void setErrorCode(int errorCode) {
         this.errorCode = errorCode;
     }
     public int getErrorCode() {
         return errorCode;
     }

}