package obj;

public class Person {

int ålder;
int kön;
Person giftmed;

public Person(int i,int k){

    ålder=i;
    kön=k;

}
public void bröllop(Person p){

    giftmed=p;

}

public static void main(String[] args) {
    
    Person daniel = new Person(30,0);
    Person veronica= new Person(40,1);

    daniel.bröllop(veronica);
    veronica.bröllop(daniel);


}



}
