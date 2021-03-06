type 'a btree = Empty | Node of 'a * 'a btree * 'a btree;;
(* Type btree defined. *)

let rec (member : 'a -> 'a btree -> bool) = fun x tree ->
   (match tree with
       Empty -> false
     | Node(y, left, right) -> if x = y then true
                                else (if x < y then (member x left)
                                  else (member x right)));;
(* member : 'a -> 'a btree -> bool = <fun> *)


let rec (insert : 'a -> 'a btree -> 'a btree) = fun x tree ->
  (match tree with
    Empty -> Node(x, Empty, Empty)
  | Node(y, left, right) ->
      if x <= y then Node(y, insert x left, right)
                else Node(y, left, insert x right))
;;
(* insert : 'a -> 'a btree -> 'a btree = <fun> *)

member 3 (insert 2 (insert 3 (insert 4 Empty)));;
(* bool = true *)
