package ac.za.cput.Repository;

import ac.za.cput.Domain.BookPlan;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author BooBoo
 */
public interface BookPlanRepository extends IRepository<BookPlan, String> {
    Set<BookPlan> getAll();

}

