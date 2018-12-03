/**
 * 
 */
package geek.pankaj.stock.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import geek.pankaj.stock.dbservice.model.Quote;

/**
 * @author Pankaj Sharma
 *
 */
public interface QuotesRepository extends JpaRepository<Quote, Integer> {

	List<Quote> findByUserName(String userName);
}
