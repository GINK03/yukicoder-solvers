
use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

fn main() {
  let stdin = io::stdin();
  let line = stdin.lock().lines().next().unwrap().unwrap();
  let m = line.parse::<i32>().unwrap();
 
  let line = stdin.lock().lines().next().unwrap().unwrap();
  let iter = line.split_whitespace();
  let mut v:Vec<i32> = Vec::new();

  for e in iter { 
    let b = (*e).parse::<i32>().unwrap();
    v.push( b );
  }
  
  let mut ii:HashMap<i32, i32> = HashMap::new();
  for i in v {
    *ii.entry(i).or_insert(0) += 10;
  }
  let mut tmp1:i32 = 0;
  let mut tmp2:i32 = 0;
  for (k, v) in ii.iter() {
    if tmp1 < *v || (tmp2 < *k && tmp1 == *v) {
      tmp2 = *k;
      tmp1 = *v;
    }
  }
  println!("{}", tmp2);
}