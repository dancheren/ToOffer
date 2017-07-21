package Offer_11;

/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution {
    boolean invalid_input = false;
    public double Power(double base, int exponent) {
        invalid_input = false;
        if(equal(base,0.0) && exponent < 0){    //如果指数小于零，而且底数为0，那么会出现零作为分母的情况
            invalid_input = true;
            return 0.0;
        }
        int absExponent = (int)exponent;   //用来保存指数的绝对值
        if(exponent < 0){
            absExponent = (int) -exponent;
        }
        double result = PowerWithUnsignedExponent_more(base,absExponent);  //将底数和指数的绝对值传入
        if(exponent < 0){
            result = 1/ result;    //如果指数为负，则将结果求导
        }
        return result;
    }
    
    public double PowerWithUnsignedExponent(double base,int exponent){
        double result = 1.0;
        for(int i = 1;i <= exponent;i++){
            result *= base;    //此时求幂指数会出现乘的次数等于指数的值，此处可以改进，
        }
        return result;
    }
    public double PowerWithUnsignedExponent_more(double base,int exponent){
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        double result = PowerWithUnsignedExponent(base,exponent >> 1);  //此处为改进后的操作，exponent分奇偶判断，递归指数的平方
        result *=result;
        if((exponent & 1) == 1)
            result *=base;
        return result;
    }
    public boolean equal(double base,double export){
        if((base - export > -0.0000001) && (base - export) < 0.0000001){
            return true;
        }else {
            return false;
        }
    }
}
