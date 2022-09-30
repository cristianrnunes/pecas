
package parts;

import java.util.ArrayList;

/**
 *
 * @author Cristian Nunes, Jonathan Forlin e Tiago Farinon
 */
public interface PartInterface {
    public long getCode();
    public String getName();
    public String getDescription();
    public ArrayList<Part> getSubParts();
    public boolean isPrimitive();
    public long countSubParts();
}
