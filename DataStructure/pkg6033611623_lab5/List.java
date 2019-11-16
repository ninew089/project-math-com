/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab5;

/**
 *
 * @author apple
 */
public interface List {
    public void add(Object e);
    public void remove(Object e);
    public boolean contains(Object e);
    public boolean isEmpty();
    public int size();
    public void add(int i,Object e);
    public Object get(int i);
    public void set(int i,Object e);
}
