

public class OrderedList<T extends Comparable> extends LinkedBag<T> 
{

	public OrderedList()
	{
		super();
	}


	/** Adds a new entry to this bag.
		    @param newEntry  The object to be added as a new entry
		    @return  True if the addition is successful, or false if not. */
	@Override
	public boolean add(T newEntry)  	      // OutOfMemoryError possible
	{
		if(firstNode == null){
			Node newNode = new Node(newEntry);
			//newNode.next = firstNode;
			firstNode = newNode; 
			numberOfEntries++;
		}
		else{

			for(Node p =firstNode; p!=null; p=p.next){	

				if(firstNode.data.compareTo(newEntry)<=0){

					Node newNode = new Node(newEntry);
					firstNode= newNode;
					numberOfEntries++;
				}


			}

		}
		return false;


		//			// Add to beginning of chain:
		//			Node newNode = new Node(newEntry);
		//			newNode.next = firstNode; // Make new node reference rest of chain
		//			// (firstNode is null if chain is empty)        
		//			firstNode = newNode;      // New node is at beginning of chain
		//			numberOfEntries++;
		//
		//			return true;

	}
	
	
	}


