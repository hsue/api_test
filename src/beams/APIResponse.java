package beams;

import java.util.List;

/**
 * Created by hsue on 12/11/18.
 */
public class APIResponse {

  Paging paging;
  List<Lender> participants;

  public Paging getPaging() {
    return paging;
  }

  public void setPaging(Paging paging) {
    this.paging = paging;
  }

  public List<Lender> getParticipants() {
    return participants;
  }

  public void setParticipants(List<Lender> participants) {
    this.participants = participants;
  }
}
