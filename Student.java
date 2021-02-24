 class Student extends Cum {//extends = inheritace= abstract

    int mark;
    String name;
    
     public void getvalue(String name, String course){
         System.out.println(name+" "+ course);
     }

     public int getMark() {
         return mark;
     }

     public void setMark(int mark) {
         this.mark = mark;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Student(int mark, String name) {
         this.mark = mark;
         this.name = name;
     }
    
}
