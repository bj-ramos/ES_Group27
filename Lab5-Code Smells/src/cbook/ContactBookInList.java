package cbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import exceptions.ContactAlreadyExistsException;
import exceptions.ContactDoesNotExistException;

public class ContactBookInList implements ContactBook {
    /**
     * A collection of contacts.
     */
    List<Contact> contacts;

    /**
     * Default constructor
     */
    //removed the type specification from LinkedList<type>
    public ContactBookInList() {
        contacts = new LinkedList<>();
    }

    @Override
    public boolean hasContact(String name) {
        return this.getContact(name) != -1;
    }

    @Override
    public int getNumberOfContacts() {
        return contacts.size();
    }

    @Override
    public void addContact(String name, int phone, String email) throws ContactAlreadyExistsException {
        if (hasContact(name))
            throw new ContactAlreadyExistsException();
        else
            contacts.add(new ContactClass(name, phone, email));
    }


    /** A possible alternative would be:
     // Contact c = this.getContact(name);
     // contacts.remove(c);
     // but this requires two searches in the list.
     // The following solution requires an equals(Object o) method
     // implemented in the ContactClass and a constructor that receives the name
     as its single argument.*/
    //moved the comment block from inside the method
    @Override
    public void deleteContact(String name) throws ContactDoesNotExistException {
        if (hasContact(name))
            contacts.remove(new ContactClass(name));
        else
            throw new ContactDoesNotExistException();
    }

    //changed every getter and setter method to accommodate for the new getContact implementation


    @Override
    public int getPhone(String name) throws ContactDoesNotExistException {
        if (hasContact(name))
            return this.contacts.get(getContact(name)).getPhone();
        else
            throw new ContactDoesNotExistException();
    }

    @Override
    public String getEmail(String name) throws ContactDoesNotExistException {
        if (hasContact(name))
            return this.contacts.get(getContact(name)).getEmail();
        else
            throw new ContactDoesNotExistException();
    }

    @Override
    public void setPhone(String name, int phone) throws ContactDoesNotExistException {
        if (hasContact(name))
            this.contacts.get(getContact(name)).setPhone(phone);
        else
            throw new ContactDoesNotExistException();
    }

    @Override
    public void setEmail(String name, String email) throws ContactDoesNotExistException {
        if (hasContact(name))
             this.contacts.get(getContact(name)).setEmail(email);
        else
            throw new ContactDoesNotExistException();
    }

    @Override
    public Iterator<Contact> listContacts() {
        return contacts.iterator();
    }

    /**
     * @param name The contact name to lookup in the list
     * @return the <code>name</code> of the contact, if it exists,
     * otherwise <code>null</code>
     */
    //remade method to avoid returning null
    private int getContact(String name){
        for (int i = 0 ; i<contacts.size(); i++)
            if (contacts.get(i).getName().equals(name))
                return i;
        return -1;
    }
}
