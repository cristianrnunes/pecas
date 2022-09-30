
package parts;

import java.util.ArrayList;

/**
 *
 * @author Cristian Nunes, Jonathan Forlin e Tiago Farinon
 */
interface PartRepositoryInterface {
    public ArrayList<Part> getList();
    public Part getPart(long index);
    public void addPart(Part part);
    public long getNextCode();
    public String getName();
    public void setName(String name);
    public long countParts();
    
}
