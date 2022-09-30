
package parts;

import java.util.ArrayList;

/**
 *
 * @author Cristian Nunes, Jonathan Forlin e Tiago Farinon
 */
public class Part implements PartInterface{
    
    private long code;
    private String name;
    private String description;
    private ArrayList<Part> subParts = new ArrayList<Part>();

    @Override
    public long getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;    
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public ArrayList<Part> getSubParts() {
        return subParts;
    }

    @Override
    public boolean isPrimitive() {
        return (subParts.size())<=0;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSubParts(ArrayList<Part> subParts) {
        this.subParts = subParts;
    }

    public void addSubPart(Part part){
        subParts.add(part);
    }
    
    public void removeSubPart(int index){
        subParts.remove(index);
    }
    
    public void removeAllSubPart(){
        subParts.clear();
    }

    @Override
    public String toString() {
        return "Part{" + "code=" + code + ", name=" + name + ", description=" + description + ", subParts=" + subParts + '}';
    }

    @Override
    public long countSubParts() {
        return subParts.size();
    }
    
    
    
}
