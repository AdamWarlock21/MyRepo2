/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Service;

/**
 *
 * @author BooBoo
 */
public interface IService<T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
