package prog7_1_startup;

public class MyTable {
	Entry[] entries = new Entry[26];
	public void add(char c, String s){
		Entry entry = new Entry(c,s);
		entries[c-97] = entry;
	}
	public String get(char c){
		return entries[c-97].s;
	}
	public String toString() {
		String outPut = "";
		for(Entry e: entries)
			if(e != null)
			outPut += e.toString();

		return outPut;
	}
	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t.get('b'));
		System.out.println(t);
	}
	class Entry {
		char c;
		String s;
		Entry(char c, String s){
			this.c = c;
			this.s = s;
		}
        public String toString(){
			return "\n"+this.c + "->" + this.s;
		}
	}
}
