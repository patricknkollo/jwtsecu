/*

package commands.controllers;

import commands.entities.Customer;
import commands.entities.Users;
import commands.exceptions.NoUserFoundException;
import commands.services.CustomerServiceShell;
import commands.services.UserServiceShell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class CommandShell {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private UserService service;

    @ShellMethod(key = "sec customers --all", value = "get the list of all the customers in the database")
    public List<Customer> getAllCustomers (){
        return customerService.findAllCustomers();
    }

    @ShellMethod(key = "sec customer username", value = "get the customer by username")
    public Customer getCustomerByUsername (@ShellOption(value = "-n") String username) throws NoUserFoundException {
        return customerService.findCustomerByUsername(username);
    }

    @ShellMethod(key = "sec customer id", value = "get the customer by ID")
    public Customer getCustomerById ( Long id) throws NoUserFoundException {
        return customerService.findCustomerById(id);
    }

    @ShellMethod(key = "sec customer save", value = "get the list of all the users in the database")
    public Customer saveCustomer(@ShellOption(value = "-B") Customer customer){
        return customerService.saveCustomer(customer);
    }

    @ShellMethod(key = "sec -ls", value = "get the list of all the users in the database")
    public List<Users> getAllUserFromDB(){
        return service.findAllUser();
    }

    @ShellMethod(key = "sec pull id", value = "get the list of all the users in the database")
    public Users getUserById(@ShellOption(value = "-i") Long userid) throws NoUserFoundException {
        return service.findUserWithID(userid);
    }

    @ShellMethod(key = "sec pull username", value = "get the list of all the users in the database")
    public Users getUserByUsername(@ShellOption(value = "-u") String username) throws NoUserFoundException {
        //logger.info("the user is: {}", principal.getName());
        return service.findUserWithUsername(username);
    }

    @ShellMethod(key = "sec pull mail", value = "get the list of all the users in the database")
    public Users getUserByUserMail(@ShellOption(value = "-e") String mail) throws NoUserFoundException {
        return service.findUserWithEmail(mail);
    }
}
*/
