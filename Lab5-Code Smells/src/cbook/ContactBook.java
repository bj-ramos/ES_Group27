//renamed package from cBook to cbook
package cbook;

import java.util.Iterator;
import exceptions.ContactAlreadyExistsException;
import exceptions.ContactDoesNotExistException;

public interface ContactBook {

    /**
     * Checks if there is a contact with the given name
     * @param name the name to lookup
     * @return <code>true</code> if the contact with <code>name</code> exists,
     * <code>false</code> otherwise
     */
    //renamed has_Contact to hasContact
    boolean hasContact(String name);

    /**
     * Returns the number of existing contacts
     * @return the number of existing contacts
     */
    //removed public scope from method declaration
     int getNumberOfContacts();



     //removed @throws tags from all methods as it would make throwing an instance of that base method a legal
    //implementation of the interface
    /**
     * Adds a new contact to the contact book
     * @param name the name of this contact
     * @param email the email address of this contact
     */
    void addContact(String name, int phone, String email) throws ContactAlreadyExistsException;

    /**
     * Removes a contact given its name
     * @param name the name of the contact to remove
     */
    void deleteContact(String name) throws ContactDoesNotExistException;

    /**
     * Checks the phone number of a contact given its name
     * @param name of the contact to get the phone number from
     * @return the phone number of the contact
     */
    int getPhone(String name) throws ContactDoesNotExistException;

    /**
     * Gets the email address of a contact, given its name
     * @param name the name of the contact for which we want to get the email address
     * @return the email address of the associated contact
     */
    String getEmail(String name) throws ContactDoesNotExistException;

    /**
     * Updates the phone number of this contact
     * @param name the name of the contact of which the phone number is to be updated
     * @param phone the new phone number of this contact
     */
    void setPhone(String name, int phone) throws ContactDoesNotExistException;

    /**
     * Updates the email address of the contact with the given name
     * @param name the name of the contact whose email is being updated
     * @param email the new email address
     */
    void setEmail(String name, String email) throws ContactDoesNotExistException;

    /**
     * Returns an iterator to all contacts
     * @return an iterator to all contacts
     */
    Iterator<Contact> listContacts();

}
