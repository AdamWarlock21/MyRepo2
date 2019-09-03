package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.BookPlan;
import ac.za.cput.Repository.BookPlanRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository("BookPlanRepositoryImpl")
public class BookPlanRepositoryImpl implements BookPlanRepository {

    private static BookPlanRepositoryImpl repository = null;
    private Map<String, BookPlan> Bplan;

    private BookPlanRepositoryImpl() {
        Bplan = new HashMap<>();
    }
    
    public static BookPlanRepository getRepository(){
        if(repository == null) repository = new BookPlanRepositoryImpl();
        return repository;
    }
    @Override
    public BookPlan create(BookPlan Bplan){
        this.Bplan.put(Bplan.getBookId(), Bplan);
        return Bplan;
    }
    @Override
    public BookPlan read(String bId){
        
     return this.Bplan.get(bId);
    }
    @Override
    public BookPlan update(BookPlan Bplan) {
        this.Bplan.replace(Bplan.getBookId(), Bplan);
       return this.Bplan.get(Bplan.getBookId());
    }
    @Override
    public void delete(String BookId) {
     Bplan.remove(BookId);   

    }

    @Override
    public Set<BookPlan> getAll(){
        Collection<BookPlan> book = this.Bplan.values();
        
        return new HashSet<>(book);
    }
}
