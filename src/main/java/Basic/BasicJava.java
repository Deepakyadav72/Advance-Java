package Basic;
class BasicJava{

    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;   
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
        public static void main(String args[]) {
        	BasicJava sc= new BasicJava();
        	sc.name="hello";
        	sc.marks=100;
        	
        	System.out.println(sc.getName());
        	System.out.println(sc.getMarks());
        	
        }    
}
