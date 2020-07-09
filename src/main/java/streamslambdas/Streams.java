package streamslambdas;

import java.util.stream.*;

// source + intermediate op + terminal op
// stream source = collections, lists, sets, ints, longs, doubles, arrays, lines of a file
// int op = filter, map, sort, anymatch, distinct, findfirst, flatmap, skip return a stream to chain multiple ops
// order matters for large datasets: filter first then sort or map
// for large datasets use ParallelStream for multiple threads
// term op = forEach, collect, reduce return void or non-stream result
// foreach applies same func to each element
// collect saves elements to a collection
// other options reduce stream to a single summary element like count, max, min, reduce, summarystatistics
public class Streams {
    static class IntStr {
        
        static {

        }
    }
}
