import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CourseDBStructure implements CourseDBStructureInterface {
	private int size;
	public LinkedList<CourseDBElement>[] hashTable;

	public CourseDBStructure(int size) {
	
	this.size = size;
		hashTable = new LinkedList[size];
	}
   
	public CourseDBStructure(String testing, int size) {
		this.size = size;
		hashTable = new LinkedList[size];
	}
       
	@Override
	public void add(CourseDBElement element) {
		
		int index = element.hashCode() % size;
		
			if(hashTable[index] == null) {
				
				hashTable[index] = new LinkedList<CourseDBElement>();
				
				}
		
                hashTable[index].add(element);
                
				}

	@Override
public CourseDBElement get(int crn) throws IOException {
		
		CourseDBElement temp = new CourseDBElement();
		temp.setCredits(crn);
		
		
			if (hashTable[temp.hashCode()%this.getTableSize()]==null)
				
				throw new IOException();
			
			else {
				
				for (int i=0;i<hashTable[temp.hashCode()%this.getTableSize()].size();i++) {
					
					if (hashTable[temp.hashCode()%this.getTableSize()].get(i).getCRN()==crn)
						
						return hashTable[temp.hashCode()%this.getTableSize()].get(i);
				}
			}
		
		return null;
		
	}
      
        @Override
	public int getTableSize() {
        	
        	return size;
        	
        }
        
	@Override
	
	public ArrayList<String> showAll() {

			return null;
			
	}

}