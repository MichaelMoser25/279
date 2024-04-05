// merge sort
void sort () {
  int i, j ;
  for ( i=1; i<n; i++ ) {
    for ( j=i; j>0 && (array[j-1]>array[j]); j-- ) {
      swap(array[j], array[j-1]);
    }
  }
}


void bubbleSort() {
  int i, j ;
  for (i=n; i>1; i--) {
    for (j=0; j<i; j++) {
      if (array[j] > array[j+1]) {
        swap(array[j],array[j+1]) ;
      }
    }
  }
}

protected void quickSort(int left, int right)
{
if (right – left + 1 > cutOff)
{
int p = selectPivot(left, right) ;
swap(p, right) ;
Comparable pivot = array[right] ;
int i=left ;
int j=right ;
for (;;)
{
while(i < j && array[i].isLT(pivot)) i++ ;
while(i < j && array[j].isGT(pivot)) j-- ;
if ( i >= j ) break ;
swap(i++, j--) ;
}
if (array[i].isGT( pivot ))
swap(i, right) ;
if (left < i)
quicksort( left, i-1 ) ;
if (right > i)
quicksort( i+1, right ) ;
}
else someOtherSort( left, right ) ;
}
