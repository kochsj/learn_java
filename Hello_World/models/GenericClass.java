package models;

public class GenericClass<Dynamic1, Dynamic2>{
    private Dynamic1 d1;
    private Dynamic2 d2;

    public GenericClass(Dynamic1 a, Dynamic2 b){
        this.d1 = a;
        this.d2 = b;
    }

    public Dynamic1 getD1(){
        return this.d1;
    }
    public Dynamic2 getD2(){
        return this.d2;
    }
}