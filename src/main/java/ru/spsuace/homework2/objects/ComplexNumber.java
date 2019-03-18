package ru.spsuace.homework2.objects;

import java.util.Objects;
/**
 * Опишите иммутабельное комплексное число, с геттерами и методами toString()
 * Так же дополните класс методами, чтобы эти объекты можно было использовать в HashMap
 */
public class ComplexNumber {
    private final double rePart;
    private final double imPart;

    ComplexNumber(double re, double im) {
        this.rePart = re;
        this.imPart = im;
    }

    public double getRePart() {
        return rePart;
    }

    public double getImPart() {
        return imPart;
    }

    @Override
    public String toString() {
        return rePart + " + " + imPart + 'i';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ComplexNumber complexNumber = (ComplexNumber) obj;
        return (rePart == complexNumber.rePart && imPart == complexNumber.imPart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rePart, imPart);
    }
}
