package lab9_6033643723;
import java.util.*;
import java.io.*;
public class ScoreList {
    Student[] s;
    ScoreList(Student[] s1){s=s1;}
    public void sortByID(){quickSort(s,0,s.length-1);}
    public void quickSort(Student[] s,int low,int high){
        if (low<high){
            int p=partition(s,low,high);
            quickSort(s,low,p-1);
            quickSort(s,p+1,high);
        }
    }
    public int partition(Student[] s,int low,int high){
        int pivot = s[high].id;
        int i=low;
        Student t;
        for(int j=low;j<high;j++){
            if(s[j].id<pivot){
                t = s[i];
                s[i]=s[j];
                s[j]=t;
                i++;
            }
        }
        t=s[i];
        s[i]=s[high];
        s[high]=t;
        return i;
    }
    public void printHighScore(int m){
        MergeSort(s);
        for(int i=0;i<s.length-1;i++){
            while(i>=0&&s[i].score==s[i+1].score&&s[i].id>s[i+1].id){
                Student t = s[i];
                        s[i]=s[i+1];
                        s[i+1]=t;
                        i--;
            }
        }
        for(int i=0;i<m;i++){System.out.println(s[i]);}
    }
    public void MergeSort(Student[] s){
        if(s.length==1)return;
        Student[] l = new Student[s.length/2];
        Student[] r = new Student[s.length-s.length/2];
        for(int i=0;i<l.length;i++){l[i]=s[i];}
        for(int i=0;i<r.length;i++){r[i]=s[i+l.length];}
        MergeSort(l);
        MergeSort(r);
        Merge(s,l,r);
    }
    public void Merge(Student[] s,Student[] l,Student[] r){
        int i=0,j=0;
        while(i+j<l.length+r.length){
            if(j==r.length||(i<l.length&&l[i].score>r[j].score)){
             s[i+j]=l[i];
             i++;
            }
            else {s[i+j]=r[j];j++;}
        }
    }
    public void importList() throws FileNotFoundException{
        Scanner f = new Scanner(new FileReader("student_score.txt"));
        ArrayList<Student> a = new ArrayList<Student>();
        while(f.hasNext()){
            String[] t = f.nextLine().split(" ");
            int id = Integer.parseInt(t[0]);
            int score = Integer.parseInt(t[t.length-1]);
            String name="";
            for(int i =1;i<t.length-1;i++){name= name+t[i]+" ";}
            name=name.trim();
            a.add(new Student(id,name,score));
        }
        s=a.toArray(new Student[a.size()]);
    }
}
