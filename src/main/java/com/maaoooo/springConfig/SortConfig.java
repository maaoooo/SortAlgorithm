package com.maaoooo.springConfig;

import com.maaoooo.Algorithm.BubbleSort;
import com.maaoooo.Algorithm.InsertionSort;
import com.maaoooo.Algorithm.SelectionSort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lzr
 * @date 2020 05 23 20:08
 * @description
 */
@Configuration
@ComponentScan(basePackages = "com.maaoooo.Algorithm")
public class SortConfig {

    @Bean
    public BubbleSort bubbleSort() {
        return new BubbleSort();
    }

    @Bean
    public SelectionSort selectionSort() {
        return new SelectionSort();
    }
    @Bean
    public InsertionSort insertionSort(){
        return new InsertionSort();
    }
}
