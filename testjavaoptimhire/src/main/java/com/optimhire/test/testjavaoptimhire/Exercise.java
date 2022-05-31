/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.optimhire.test.testjavaoptimhire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author guillermo
 */
public class Exercise {

    public static class Category {
        // Define the following fields with getters and setters:
        //    id: a unique numeric identifier of the category
        //    parentId: id of the parent category or null if it doesn't have the parent
        //    name: a string representation of category name
        //    path: a complete path to the category whose components are category names separated by " > "

        //<enter your code here>
        private int id;
        private int parentId;
        private String name;

        public Category(int id, int parentId, String name, String path) {
            this.id = id;
            this.parentId = parentId;
            this.name = name;
            this.path = path;
        }

        public Category() {
            this.id = 0;
            this.parentId = 0;
            this.name = "";
            this.path = "";
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
        private String path;

    }

    public static void populatePath(List<Category> categories) {
        // Input is a collection of categories, where "id", "parentId", and "name" are pre-populated. 
        // Implement this method to populate the path for each category in the collection.
        // For example, if category A is the parent of category B, then
        //      the path for category A is "A" 
        //  and the path for category B is "A > B"
        //  where "A" is the name of category A
        //    and "B" is the name of category B.      

        //<enter  your code here>
        Category categoryAnt = new Category();
        for (Category category : categories) {
            if (category.parentId == 0) {
                category.path = category.name;
            } else {
                category.path = categoryAnt.name + " > " + category.name;
            }
            System.out.println(category.name);
            System.out.println(category.path);
            categoryAnt = category;
        }
    }

    public static void main(String... args) {
        // Define a collection of Category instances
        // Invoke "populatePath" method above to populate the path for all the categories in the collection

        //<enter  your code here>
        Category category = new Category(1, 0, "First", "");
        Category category2 = new Category(2, 1, "First", "");
        Category category3 = new Category(3, 2, "First", "");
        Category category4 = new Category(4, 3, "First", "");

        List<Category> ml = new ArrayList();
        ml.add(category);
        ml.add(category2);
        ml.add(category3);
        
        populatePath(ml);
    }
}
