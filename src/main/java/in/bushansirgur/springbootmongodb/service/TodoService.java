package in.bushansirgur.springbootmongodb.service;

import in.bushansirgur.springbootmongodb.exception.TodoCollectionException;
import in.bushansirgur.springbootmongodb.model.TodoDTO;
import in.bushansirgur.springbootmongodb.repository.TodoRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TodoService {

    public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException;

    public List<TodoDTO> getAllTodos();

    public TodoDTO getSingleTodo(String id) throws  TodoCollectionException;

    public void updateTodo(String id, TodoDTO todo) throws  TodoCollectionException;

    public void deleteTodoById(String id) throws  TodoCollectionException;
}
