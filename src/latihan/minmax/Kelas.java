package latihan.minmax;
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
public class Kelas {
	public int jumlahMhs;
	public List<Integer> nilai = new ArrayList<>();
	public String petugas;
	
	public Integer findMin(List<Integer> list){ 
	      
		List<Integer> sortedlist = new ArrayList<>(list); 
		Collections.sort(sortedlist); 
		return sortedlist.get(0); 
	} 

	public Integer findMax(List<Integer> list){ 
		List<Integer> sortedlist = new ArrayList<>(list); 
		Collections.sort(sortedlist); 
		return sortedlist.get(sortedlist.size() - 1); 
	} 
	
}
