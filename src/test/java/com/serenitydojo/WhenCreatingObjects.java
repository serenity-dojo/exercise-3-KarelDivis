package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Dog.makeNoise;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void dogIsNotMute(){
        System.out.println(makeNoise());
        Assert.assertEquals(makeNoise(), "Woof");
    }

    @Test
    public void feedNewDog(){
        Dog pluto = new Dog("pluto", 2);
        System.out.println("Ïs Pluto fed?: " + pluto.getIsFed());
        Assert.assertFalse(pluto.getIsFed());

        pluto.feed();
        System.out.println("Is Pluto fed after feeding?: a" + pluto.getIsFed());
        Assert.assertTrue(pluto.getIsFed());
    }
}
