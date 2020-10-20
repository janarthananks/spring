/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T, D> extends JpaRepository<T, D> {

}