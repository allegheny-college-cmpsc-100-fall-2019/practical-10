package election;

import java.util.ArrayList;

/** Creates a ballot object to hold all valid Candidates.
 *
 * @author {Your Name Here}
 */
public class Ballot {
  private ArrayList<Candidate> form;

  /** Constructor.
   *
   */
  public Ballot() {
    form = new ArrayList<Candidate>();
  }
  
  /** Adds a candidate to the ballot, if not already there.
   *
   * @param candidate Candidate object to add
   */
  public void addCandidate(Candidate candidate) {
    /*
     * TODO Initialize an int to capture the output of the
     *      searchCandidates method.
     *
     * Note: the searchCandidates method takes how many parameters
     *       of what kind? What information does that parameter contain?
     */
    if (/* TODO Use int to make sure candidate isn't found */) {
      // TODO Add candidate object to identifier "form": see instance variables
    }
  }
  
  /** Retrieves candidate objects by name.
   *
   * @param name Candidate name
   */
  public Candidate getCandidate(String name) {
    /*
     * TODO Initialize an int to capture the output of the
     *      searchCandidates method.
     *
     * Note: the searchCandidates method takes how many parameters
     *       of what kind? What information does this method (getCandidate
     *       recieve?
     */
    if (/* TODO Compare if index above does not equal -1 */) {
      return // Return the item requested, by index using the "form" identifer: see instance variables
    }
    return null;
  }
  
  /** Searches a ballot form by candidate name and retrieves position.
   *
   * @param name Candidate name
   * @return int Returns index of candidate in ArrayList or -1 if not found
   */
  private int searchCandidates(String name) {
    int index = 0;
    Candidate candidate;
    while (index < this.form.size()) {
      candidate = this.form.get(index);
      if (candidate.name.equals(name)) {
        return index;
      }
      index++;
    }
    return -1;
  }
  
  /** Prints a complete ballot to the screen.
   *
   */
  public String toString() {
    int index = 0;
    String ballot = "Current ballot for pond representative:" + "\n\n";
    Candidate candidate;
    while (index < this.form.size()) {
      candidate = this.form.get(index);
      ballot += String.format("%-20s%5d",candidate.name,candidate.getVotes());
      index++;
      if (index != this.form.size()) {
        ballot += "\n";
      }
    }
    return ballot;
  }
}