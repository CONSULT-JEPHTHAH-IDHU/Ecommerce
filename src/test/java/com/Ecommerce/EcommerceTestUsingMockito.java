package com.Ecommerce;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EcommerceTestUsingMockito {

    @Mock
    List<String> mocklist;

    @Test
    public void testObjectMocking_and_thenSeeInjection(){
        mocklist.add("Learning MOckito");
        mocklist.add("Jeph");

        Mockito.verify(mocklist, times(1)).add("Jeph");
        System.out.println("size of mocklist: "+mocklist.size());
        assertEquals(0,mocklist.size());


        when(mocklist.get(0)).thenReturn("Learning MOckito");
        System.out.println("sent correct value");
        assertEquals("Learning MOckito", mocklist.get(0));
        System.out.println("sent correct value : Assert");


        when(mocklist.get(0)).thenReturn("Learning MOckito 0");
        System.out.println("sent wrong value");
        assertEquals("Learning MOckito", mocklist.get(0));
    }

}
