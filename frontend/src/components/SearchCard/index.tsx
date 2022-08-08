import './styles.css';

const SearchCard = () => {
    return (
        <div className='base-card search-card'>
            <div className='card-input input-group'>
                <input type="text" className="form-control" placeholder="Digite sua busca" />
                <button className="btn btn-primary" type="button">BUSCAR</button>
            </div>
        </div>
    );
}

export default SearchCard;