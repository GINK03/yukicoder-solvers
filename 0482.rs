use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

fn main() {
  let stdin  = io::stdin();
  let line   = stdin.lock().lines().next().unwrap().unwrap();
  let v      = line.split(" ").collect::<Vec<&str>>()
                .iter().map( |x| x.to_string()).map(|x| x.parse::<i32>().unwrap() ).collect::<Vec<i32>>();
  let (n, k) = (v[0], v[1]);
  let line   = stdin.lock().lines().next().unwrap().unwrap();
  let mut v  = line.split(" ").collect::<Vec<&str>>()
                .iter().map( |x| x.to_string()).map(|x| x.parse::<usize>().unwrap() - 1 ).collect::<Vec<usize>>();
  let mut va = v.clone();
  va.sort();
  let mut cnt = 0;
  
  for i in (0..v.len()) {
    if v[i] != i {
      let mut toswap = v[i];
      v[i]           = v[toswap];
      v[toswap]      = toswap;
      cnt += 1;
    }
  }
  if cnt <= k && cnt%2 == k%2  {
    println!("YES");
  }else {
    println!("NO");
  }
}