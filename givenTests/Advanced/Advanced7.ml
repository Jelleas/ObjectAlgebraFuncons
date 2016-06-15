let curry f = fun x y -> (f (x,y));;
(* curry : ('a * 'b -> 'c) -> 'a -> 'b -> 'c = <fun> *)

let rec concat = function []         -> []
                        | [xs :: xss]  -> (xs @ (concat xss)) ;;
(* concat : 'a list list -> 'a list = <fun> *)

let rec map f xs = match xs with
     []      -> []
   | [y :: ys] -> (f y) :: (map f ys) ;;
(* map : ('a -> 'b) -> 'a list -> 'b list = <fun> *)

let concatMap f xs = (concat (map f xs)) ;;
(* concatMap : ('a -> 'b list) -> 'a list -> 'b list = <fun> *)

type 'a roseTree = Branch of 'a * ('a roseTree) list;;
(* Type roseTree defined. *)

let mkbranch = curry Branch;;
(* mkbranch : '_a -> '_a roseTree list -> '_a roseTree = <fun> *)

let rec flatten = function Branch (a,rts) -> (a :: (concatMap flatten rts)) | [] -> [] ;;
(* flatten : 'a roseTree -> 'a list = <fun> *)

let tree1 = (mkbranch 1 [mkbranch 2 [] , mkbranch 3 []]);;
(* tree1 : int roseTree = Branch (1, [Branch (2, []); Branch (3, [])]) *)

flatten tree1;;
(* - : int list = [1; 2; 3] *)
