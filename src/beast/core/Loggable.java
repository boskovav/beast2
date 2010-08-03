package beast.core;

import java.io.PrintStream;

/**
 * @author Andrew Rambaut
 * @version $Id$
 */
public interface Loggable {
    // uncommented code: what is this???
    //List<String> getLabels();
    //List<Object> log(int sample, State state);

    /** write header information, e.g. labels of a parameter,
     * or Nexus tree preamble
     * @param out  log stream
     * @throws Exception
     **/
    //void init(State state, PrintStream out) throws Exception;
    void init(PrintStream out) throws Exception;

    /** log this sample for current state to PrintStream,
     * e.g. value of a parameter, list of parameters or Newick tree
     * @param nSample chain sample number
     * @param out  log stream
     **/
    //void log(int nSample, State state, PrintStream out);
    void log(int nSample, PrintStream out);

    /** close log. An end of log message can be left (as in End; for Nexus trees) **/
    void close(PrintStream out);
}
