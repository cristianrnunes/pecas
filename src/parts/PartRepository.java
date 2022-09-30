
package parts;

import java.util.ArrayList;

/**
 *
 * @author Cristian Nunes, Jonathan Forlin e Tiago Farinon
 */
public class PartRepository implements PartRepositoryInterface{
    private ArrayList<Part> parts;
    private long lastCode;
    private String name;
    
    public PartRepository() {
        lastCode = 0;
    }
    
    
    @Override
    public ArrayList<Part> getList() {
        return parts;
    }

    @Override
    public Part getPart(long index) {
        return parts.get((int)index);
    }

    @Override
    public void addPart(Part part) {
        parts.add(part);
        lastCode++;
     }

    @Override
    public long getNextCode() {
        return lastCode+1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public long countParts() {
        return parts.size();
    }
    
}
