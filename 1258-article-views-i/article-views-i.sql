Select author_id as id From Views
where author_id= viewer_id
group by author_id
order by id;