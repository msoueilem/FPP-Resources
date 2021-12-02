package prog4_9_startup;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	private void add(String s){
		if(size >= strArray.length){
			resize();
		}
		strArray[size] = s;
		size ++;
	}
	
	public String get(int i){
		if (strArray.length<i)
			return strArray[i];
		return null;
	}
	
	public boolean find(String s){
		for (int i=0;i<strArray.length;i++){
			if (strArray[i].equals(s))
				return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if (pos < size){
			for (int i = size - 1; i >= pos; i--){
				strArray[i+1]=strArray[i];
			}
			strArray[pos] = s;

		}
		else if (pos == size)
			strArray[pos] = s;
		size++;
	}
	
	public boolean remove(String s){
			for (int i=0;i<=strArray.length;i++){
				if (strArray[i].equals(s)){
					for (int j = i; j <= size; j++){
						strArray[j]=strArray[j+1];
					}
					size--;
					return true;
				}
			}
		return false;
	}
	
	
	private void resize(){
		int i = size * 2;
		String[] strArray2 = new String[i];
		System.arraycopy(strArray,0,strArray2,0,size);
		strArray = strArray2;
		System.out.println("Resizing...");
	}
	public String toString(){
		if (strArray.length!=0){
			String s = "[";
			for (int i=0;i<size-1;i++){
				s = s +strArray[i] + ",";
			}
			s = s + strArray[size-1]+"]";
			return s;
		}
		return "";
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		/*MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);
		 */
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	}
}
