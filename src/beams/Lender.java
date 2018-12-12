package beams;

/**
 * Created by hsue on 12/11/18.
 */
public class Lender extends Participant{
  String lender_id;
  String whereabouts;
  String country_code;
  String uid;

  public String getLender_id() {
    return lender_id;
  }

  public void setLender_id(String lender_id) {
    this.lender_id = lender_id;
  }

  public String getWhereabouts() {
    return whereabouts;
  }

  public void setWhereabouts(String whereabouts) {
    this.whereabouts = whereabouts;
  }

  public String getCountry_code() {
    return country_code;
  }

  public void setCountry_code(String country_code) {
    this.country_code = country_code;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

}
