/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import framework.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
interface EmployeeRepository extends BaseRepository<Employee, Long> {

}